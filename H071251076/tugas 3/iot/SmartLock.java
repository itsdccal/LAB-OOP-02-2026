package iot;
public class SmartLock{
    private String passcode;
    private Boolean isLocked;
    protected Boolean isFreeze;
    protected String deviceId;
    protected int attempt;

    public SmartLock(String deviceId, String passcode){
            this.deviceId = deviceId;
            this.passcode = "000000";
            this.attempt = 0; //temp
            this.isLocked = true;
            this.isFreeze = false;
        }

    // public String getDeviceId(){
    //     return deviceId;
    // }

    // public String getAttempt(){
    //     return attempt;
    // }
    
    public String getPasscode(){
        return passcode;
    }

// there should be a method for while isCodeValid false, isLocked is true, util the unlock() method maybe? what the logic tho
    public void unlock(String codeInput) { //3 times loop, if wrong, then attempt failed, trigger isFrozen(), trigger sendAlertToOwner() if attempted to be breached
        if(isFreeze){
            System.out.println("Akses telah dihentikan.");
            return;
        }

        if(codeInput.equals(this.passcode)){
            isLocked = false;
            this.attempt = 0;
            System.out.println("Selamat datang.");
        }else{
            this.attempt++;
            if (this.attempt >= 3){
                isFreeze = true;
                System.out.println("Akun anda telah dikunci");
            }
        }
    }
}


// there should be a way to save how much attempts i've done via attempt string
