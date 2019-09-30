package SimpleRemote;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execcute() {
        light.on();
    }
}
