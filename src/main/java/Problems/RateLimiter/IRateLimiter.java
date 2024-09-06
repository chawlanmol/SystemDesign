package Problems.RateLimiter;

public interface IRateLimiter {
    boolean allow(Integer requestId, Integer timeStamp);
}
