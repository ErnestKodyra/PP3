public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume
{
    private boolean isOn;
    private int channelNo = 1;
    private int volume = 1;
    
    public void on(){
        isOn = true;
    }
    public void off(){
        isOn = false;
    }
    public void channelUp(){
        if(isOn == true){
            if(channelNo == 99){
                channelNo = 0;
            }
            channelNo++;
        }
    }
    public void channelDown(){
        if(isOn == true){
            if(channelNo == 1){
                channelNo = 100;
            }
            channelNo--;
        }
    }
    public void volumeUp(){
        if(isOn == true & volume < 10){
            volume++;
        }
    }
    public void volumeDown(){
        if(isOn == true & volume > 1){
            volume--;
        }
    }
    public void setChannel(int channo){
        if(channo >= 1 & channo <= 99 & isOn == true){
            channelNo = channo;
        }
        else{
            System.out.println("Invalid channel number. Please select a channel between 1 and 99.");
        }
    }
    public void displayStatus(){
        if(isOn==true){
            System.out.println("TV is on. \nCurrent channel: " + channelNo + "\nVolume: " + volume);
        }
        else{
            System.out.println("TV is off.");
        }
    }
    
    public static void main(String[] args){
        TV tele = new TV();
        tele.on();
        tele.displayStatus();
        tele.setChannel(15);
        tele.volumeUp();
        tele.volumeUp();
        tele.volumeUp();
        tele.volumeUp();
        tele.volumeUp();
        tele.volumeUp();
        tele.displayStatus();
        tele.off();
        tele.displayStatus();
    }
}
