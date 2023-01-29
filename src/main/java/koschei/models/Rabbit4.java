package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 duk;

    @Autowired
    public void setDuk(Duck5 duk) {
        this.duk = duk;
    }
    @Override
    public String toString() {
        return ", в зайце утка " + duk.toString();
    }
}
