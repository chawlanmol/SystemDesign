import Problems.TokenBucketRateLimiter.TokenBucketDemo;

public class Main {

    public static void main(String[] args) {

        try {
            new TokenBucketDemo().Demo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
