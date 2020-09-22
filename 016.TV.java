package TVSimulation;

import java.util.ArrayList;

public class TV {
    private String brand;
    private String inc;
    private ArrayList<Channel> channels;
    private boolean isOpen;
    private int voice;
    private int activeChannel;


    public TV(String brand, String inc) {
        this.brand = brand;
        this.inc = inc;
        channels = new ArrayList<>();
        voice = 10;
        activeChannel = 1;
        channelCreated();
        this.isOpen = false;
    }

    public void voiceEnh() {
        if (voice < 20 && isOpen) {
            voice++;
            System.out.println("Ses seviyesi: " + voice);
        } else {
            System.out.println("Ses maksimumda daha fazla arttıramazsın veya TV kapalı");
        }
    }

    public void voiceRed() {
        if (voice > 20 && isOpen) {
            voice--;
            System.out.println("Ses seviyesi " + voice);
        } else {
            System.out.println("Ses minumumda daha fazla azaltamazsın");
        }
    }

    public void tvOpen() {
        if (isOpen == false) {
            isOpen = true;
            System.out.println("Tv Açıldı");
        } else {
            System.out.println("Tv Zaten Açık");
        }
    }

    public void tvClose() {
        if (isOpen == true) {
            isOpen = false;
            System.out.println("Tv Kapandı");
        } else {
            System.out.println("Tv Zaten Kapalı");
        }
    }

    private void channelCreated() {
        NewsChannel cnn = new NewsChannel("CNN", 1, "Genel Haberler");
        channels.add(cnn);
        MusicChannel fenomen = new MusicChannel("Fenomen", 2 , "Yerli");
        channels.add(fenomen);
        FinancialChannel bloomberg = new FinancialChannel("Bloomberg", 3, "Yabancı");
        channels.add(bloomberg);
        NewsChannel fox = new NewsChannel("Fox", 4, "Genel Haberler");
        channels.add(fox);
        MusicChannel numberOne = new MusicChannel("Number One", 5 , "Yabancı");
        channels.add(numberOne);

    }

    public void activeChannelPrint() {
        if (isOpen)
            System.out.println("Aktif kanal: " + channels.get(activeChannel - 1).channelInfo());
        else
            System.out.println("Önce televizyonu açınız");
    }

    public void changeChannel(int openChannel) {
        if (isOpen) {
            if (openChannel != activeChannel) {
                if (openChannel <= channels.size() && openChannel >= 0) {
                    activeChannel = openChannel;
                    System.out.println("Kanal " + openChannel + " Bilgi: " + channels.get(activeChannel - 1).channelInfo());
                } else {
                    System.out.println("Geçerli bir kanal numarası giriniz: ");
                }
            } else {
                System.out.println("Zaten " + activeChannel + " . kanaldasınız. Değiştirme Yapılmadı");
            }
        } else {
            System.out.println("Önce Televizyonu açın");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", inc='" + inc + '\'' +
                "oluşturuldu" +
                '}';
    }
}
