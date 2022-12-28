package tests;

public enum ProductName {
    SAMSUNG_GALAXY_S6("imgs/galaxy_s6.jpg","Samsung galaxy s6", 360,"The Samsung Galaxy S6 " +
            "is powered by 1.5GHz octa-core Samsung Exynos 7420\n" + " processor and it comes with 3GB of RAM. The " +
            "phone packs 32GB of \n" + "internal storage cannot be expanded.  "),
    NOKIA_LUMIA_1520("imgs/Lumia_1520.jpg","Nokia lumia 1520",820,"The Nokia Lumia 1520 is " +
            "powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM.  "),
    NEXUS_6("imgs/Nexus_6.jpg","Nexus 6",650,"The Motorola Google Nexus 6 is powered by " +
            "2.7GHz quad-core Qualcomm Snapdragon 805 processor and it comes with 3GB of RAM. "),
    SAMSUNG_GALAXY_S7("imgs/galaxy_s6.jpg","Samsung galaxy s7",800,"The Samsung Galaxy S7 " +
            "is powered by 1.6GHz octa-core it comes with 4GB \n" + "of RAM. The phone packs 32GB of internal storage " +
            "that can be expanded up\n" + " to 200GB via a microSD card. "),
    IPHONE_6_32GB("imgs/iphone_6.jpg","Iphone 6 32gb",790,"It comes with 1GB of RAM. The " +
            "phone packs 16GB of internal storage \n" + "cannot be expanded. As far as the cameras are concerned, the " +
            "Apple \n" + "iPhone 6 packs a 8-megapixel primary camera on the rear and a \n" +
            "1.2-megapixel front shooter for selfies. "),
    SONY_XPERIA_Z5("imgs/xperia_z5.jpg","Sony xperia z5",320,"Sony Xperia Z5 Dual " +
            "smartphone was launched in September 2015. The phone\n" + " comes with a 5.20-inch touchscreen display " +
            "with a resolution of 1080 \n" + "pixels by 1920 pixels at a PPI of 424 pixels per inch. "),
    HTC_ONE_M9("imgs/HTC_M9.jpg","HTC One M9",700,"The HTC One M9 is powered by 1.5GHz " +
            "octa-core Qualcomm Snapdragon 810 \n" + "processor and it comes with 3GB of RAM. The phone packs 32GB of " +
            "internal\n" + " storage that can be expanded up to 128GB via a microSD card.  "),
    SONY_VAIO_I5("imgs/sony_vaio_5.jpg","Sony vaio i5",790,"Sony is so confident that the " +
            "VAIO S is a superior ultraportable laptop \n" + "that the company proudly compares the notebook to " +
            "Apple's 13-inch \n" + "MacBook Pro. And in a lot of ways this notebook is better, thanks to a \n" +
            "lighter weight. "),
    SONY_VAIO_I7("imgs/sony_vaio_5.jpg","Sony vaio i7",790,"REVIEW\n" + " \n" + "Sony is so" +
            " confident that the VAIO S is a superior \n" + "ultraportable laptop that the company proudly compares " +
            "the notebook to \n" + "Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is \n" + "better, " +
            "thanks to a lighter weight, higher-resolution display, more \n" + "storage space, and a Blu-ray drive.  "),
    APPLE_MONITOR_24("imgs/apple_cinema.jpg","Apple monitor 24",400,"LED Cinema Display " +
            "features a 27-inch glossy LED-backlit TFT \n" + "active-matrix LCD display with IPS technology and an " +
            "optimum resolution \n" + "of 2560x1440. It has a 178 degree horizontal and vertical viewing angle,\n" +
            " a \"typical\" brightness of 375 cd/m2, contrast ratio of 1000:1, and a \n" + "12 ms response time. "),
    MACBOOK_AIR("imgs/apple_cinema.jpg","MacBook air",700,"1.6GHz dual-core Intel Core i5 " +
            "(Turbo Boost up to 2.7GHz) with 3MB \n" + "shared L3 cache\n" + "Configurable to 2.2GHz dual-core Intel " +
            "Core i7 (Turbo \n" + "Boost up to 3.2GHz) with 4MB shared L3 cache. "),
    DELL_I7_8GB("imgs/dell.jpg","Dell i7 8gb",700,"6th Generation Intel Core i7-6500U " +
            "Dual-Core Processor 2.5 GHz (max \n" + "boost speed up to 3.1GHz) 4MB L3 Cache, 8GB DDR4 1600 MHz, 1TB " +
            "5400 RPM \n" + "HDD15.6 in Full HD LED-backlit touchscreen with Truelife (1920 x 1080), \n" + "10-finger" +
            " multi-touch support, Intel HD Graphics 520 with shared \n" + "graphics memory "),
    DELL_15_6_INCH("imgs/dell.jpg","2017 Dell 15.6 Inch",700,"7th Gen Intel Core i7-7500U " +
            "mobile processor 2.70 GHz with Turbo Boost \n" + "Technology up to 3.50 GHz, Intel HD Graphics 62015.6 " +
            "inch Full HD IPS \n" + "TrueLife LED-backlit touchscreen (1920 x 1080), 10-finger multi-touch \n" +
            "support, 360° flip-and-fold design,8GB DDR4 2400 MHz Memory, 1TB 5400 \n" + "RPM HDD, No optical drive, " +
            "3 in 1 card reader (SD SDHC SDXC) "),
    ASUS_FULL_HD("imgs/asusm.jpg","ASUS Full HD",230,"ASUS VS247H-P 23.6- Inch Full HD "),
    MACBOOK_PRO("imgs/macbook_air.jpg","MacBook Pro",1100,"Apple has introduced three new " +
            "versions of its MacBook Pro line, \n" + "including a 13-inch and 15-inch model with the Touch Bar, a thin," +
            " \n" + "multi-touch strip display that sits above the MacBook Pro's keyboard.  ");

    private String img;
    private String name;
    private int price;
    private String description;

    ProductName (String img, String name, int price, String description) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getImg() {
        return img;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
