public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV(int channel,int volumeLevel,boolean on){
        this.channel=channel;
        this.volumeLevel=volumeLevel;
        this.on=on;
    }

    public boolean turnOn(){
        if(this.on==false) {
            System.out.println("TV encendida....");
            return this.on = true;
        }
        System.out.println("La TV ya esta encendida");
        return this.on;

    }

    public boolean turnOff(){
        if(this.on==false){
        System.out.println("La TV ya esta apagada");
        return this.on;
        }
        System.out.println("TV apagada...");
        return this.on=false;
    }

    public void setChannel(int newChannel){
        if(newChannel>0 && newChannel<366){
            this.channel=newChannel;
            System.out.println("Canal en viendo: "+this.channel);
            return;
        }
        System.out.println("Canal inexistente");
    }

    public void upChannel(){
        this.channel++;
        if(this.channel==366){
            this.channel=1;
        }
        System.out.println("Canal en viendo: "+this.channel);
    }

    public void downChannel(){
        this.channel--;
        if(this.channel==0){
            this.channel=365;
        }
        System.out.println("Canal en viendo: "+this.channel);
    }
    public void volumeUp(){
        if(this.volumeLevel==100){
            System.out.println("Volumen: "+this.volumeLevel);
            return;
        }
        this.volumeLevel++;
        System.out.println("Volumen: "+this.volumeLevel);
    }

    public void volumeDown(){
        if(this.volumeLevel==0){
            System.out.println("Volumen: "+this.volumeLevel);
            return;
        }
        this.volumeLevel--;
        System.out.println("Volumen: "+this.volumeLevel);
    }

}
