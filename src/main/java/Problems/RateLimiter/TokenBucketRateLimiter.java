package Problems.RateLimiter;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.max;

public class TokenBucketRateLimiter implements IRateLimiter {
    Integer refillRate;

    Integer capacity;

    AtomicInteger currentToken;

    AtomicInteger lastRequestTime;

    public TokenBucketRateLimiter(Integer refillRate , Integer capacity) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.currentToken = new AtomicInteger(0);
        this.lastRequestTime = new AtomicInteger(0);

    }
    @Override
    public boolean allow(Integer requestId, Integer timeStamp) {
        Integer tokenToBeRefilled = (timeStamp - lastRequestTime.get()) * refillRate/100;
        currentToken.set(max(capacity , currentToken.get() + tokenToBeRefilled));
        lastRequestTime.set(timeStamp);
        if(currentToken.get() > 0) {
            currentToken.decrementAndGet();
            return true;
        }
        return false;
    }


}
