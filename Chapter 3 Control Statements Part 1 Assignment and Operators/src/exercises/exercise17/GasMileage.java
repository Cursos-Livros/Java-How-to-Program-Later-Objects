package exercises.exercise17;

public class GasMileage {

    private Integer kmdrive;
    private Integer usedLitter;

    public GasMileage(Integer kmdrive, Integer usedLitter) {
        this.kmdrive = kmdrive;
        this.usedLitter = usedLitter;
    }


    public Integer getKmdrive() {
        return kmdrive;
    }

    public void setKmdrive(Integer kmdrive) {
        this.kmdrive = kmdrive;
    }

    public Integer getUsedLitter() {
        return usedLitter;
    }

    public void setUsedLitter(Integer usedLitter) {
        this.usedLitter = usedLitter;
    }

    public Double kmPerLiter(){
        return (double) kmdrive / usedLitter;
    }
}
