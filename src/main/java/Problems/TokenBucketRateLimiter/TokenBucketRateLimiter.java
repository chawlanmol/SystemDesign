package Problems.TokenBucketRateLimiter;

import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketRateLimiter {

    private long bucketCapacity;

    private long refillRate;

    private AtomicLong currentTokens;

    private long lastRequestTime;

    public TokenBucketRateLimiter(long bucketCapacity, long refillRate) {
        this.bucketCapacity = bucketCapacity;
        this.refillRate = refillRate;
        currentTokens = new AtomicLong(0);
    }


    private void refill() {
        long currentTime =  System.currentTimeMillis();
        long tokenToAdd = (currentTime - lastRequestTime)*refillRate/(1000);
        System.out.println(tokenToAdd);
        long tokens = Math.min(bucketCapacity, tokenToAdd + currentTokens.get());
        currentTokens.set(tokens);
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
