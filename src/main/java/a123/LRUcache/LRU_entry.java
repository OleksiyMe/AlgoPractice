package a123.LRUcache;

public class LRU_entry {
    private Integer value;
    private Integer timeWhenUsed;

    public LRU_entry(Integer value, Integer timeWhenUsed) {
        this.value = value;
        this.timeWhenUsed = timeWhenUsed;
    }

    public LRU_entry() {
    }

    public LRU_entry incrementTime() {
        timeWhenUsed++;
        return this;
    }

    public Integer getValue(Integer maxTimeIndex) {
        timeWhenUsed=maxTimeIndex;
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTimeWhenUsed() {
        return timeWhenUsed;
    }

    public void setTimeWhenUsed(Integer timeWhenUsed) {
        this.timeWhenUsed = timeWhenUsed;
    }
}
