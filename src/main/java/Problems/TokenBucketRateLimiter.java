package Problems;

import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketRateLimiter {

    private long bucketCapacity;

    private long refillRate;

    private AtomicLong currentTokens;

    private long lastRequestTime;

    public TokenBucketRateLimiter(long bucketCapacity, long refillRate) {
        this.bucketCapacity = bucketCapacity;
        this.refillRate = refillRate;
    }


    private void refill() {
        long currentTime =  System.currentTimeMillis();
        long tokenToAdd = (currentTime - lastRequestTime) * refillRate/1000;
        currentTokens.set(Math.min(bucketCapacity, tokenToAdd + currentTokens.get()));
        lastRequestTime = currentTime;
    }



    public Boolean processRequest(long tokenRequested) {
        refill();
        if(currentTokens.get() > tokenRequested) {
            currentTokens.set(currentTokens.get()-tokenRequested);
            return true;
        }
        return false;
    }
}
