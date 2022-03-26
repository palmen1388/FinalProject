public class Deal {

    private String name;
    private String specification;
    private DealPriority dealPriority;
    private Deal next;


    public Deal getNext() {
        return next;
    }

    public void setNext(Deal next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public DealPriority getDealPriority() {
        return dealPriority;
    }

    public void setDealPriority(DealPriority dealPriority) {
        this.dealPriority = dealPriority;
    }

    @Override
    public String toString() {
        return name +
                ":" + "\n" + specification + "\n" +
                dealPriority;
    }
}
