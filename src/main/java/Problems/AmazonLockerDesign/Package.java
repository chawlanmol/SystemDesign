package Problems.AmazonLockerDesign;

public class Package {
    private Integer packageID;

    private PackageType packageType;

    public void setPackageID(Integer packageID) {
        this.packageID = packageID;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public Integer getPackageID() {
        return packageID;
    }

    public PackageType getPackageType() {
        return packageType;
    }

}
