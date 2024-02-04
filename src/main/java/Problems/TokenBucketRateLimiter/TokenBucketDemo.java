package Problems.TokenBucketRateLimiter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TokenBucketDemo {

    public void Demo() throws InterruptedException {
        TokenBucketRateLimiter tokenBucketRateLimiter = new TokenBucketRateLimiter(10, 2);

        for(int i = 0; i < 50 ;i++) {

           boolean isSuccess =  tokenBucketRateLimiter.processRequest(1);

           System.out.println(isSuccess);

           log.error("Request rate limited : " + isSuccess);

           Thread.sleep(500);
        }
    }
}
