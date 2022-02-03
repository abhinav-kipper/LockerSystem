package entities;

import java.util.List;

public class Package {

    private String packageId;
    private List<Item> items;
    private Long packageSize;

    public Package(String packageId, List<Item> items) {
        this.packageId = packageId;
        this.items = items;
        this.packageSize = 0L;
       for (int i=0; i< items.size(); i++)
           packageSize+=items.size();
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(Long packageSize) {
        this.packageSize = packageSize;
    }
}
