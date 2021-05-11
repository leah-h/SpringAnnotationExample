package io.lhdev.SpringAnnoExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // non-qualified and de-capitalized
public class Samsung {

    @Autowired
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Samsung Galaxy S21 Ultra, 256GB");
        cpu.process();
    }
}
