package com.example.fonet.enums;

public class Enums {
    public enum HeatingType {
        None, Stove, Gas_Stove, Central_Heating, Central_Heating_Meter, Combi_Gas, Combi_Electric, Underfloor_Heating,
        Air_Conditioner, Fancoil_Unit, Solar_Energy, Electric_Radiator, Geothermal, Fireplace, VRV, Heat_Pump
    }

    public enum PropertyStatus {
        For_Sale, For_Rent
    }

    public enum DetailedResidentialType {
        Apartment, Residence, Detached_House, Villa, Farmhouse, Mansion, Waterfront_House, Waterfront_Apartment, Summer_House
    }

    public enum FloorLocation {
        Basement_Minus_4, Basement_Minus_3, Basement_Minus_2, Basement_Minus_1, Basement_Floor, Ground_Floor, Garden_Floor,
        Entrance_Floor, High_Entrance, Detached, Villa_Type, Attic, _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
        _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _27, _28, _29, _30, _30_PLUS
    }

    public enum Balcony {
        Yes, No
    }

    public enum Elevator {
        Yes, No
    }

    public enum Parking {
        Open_Parking, Closed_Parking, Open_And_Closed_Parking, None
    }

    public enum Furnished {
        Yes, No
    }

    public enum UsageStatus {
        Empty, Rented, Owner_Occupied
    }

    public enum InSite {
        Yes, No
    }

    public enum Orientation {
        North, South, West, East
    }

    public enum InternalFeatures {
        ADSL, Woodwork, Smart_Home, Alarm_Theft, Alarm_Fire, Squat_Toilet, Aluminum_Joinery, American_Door, American_Kitchen,
        Built_in_Oven, BBQ, Painted, Laundry_Room, Steel_Door, Shower_Cabin, En_Suite_Bathroom, Fiber_Internet, Dressing_Room,
        Built_in_Wardrobe, Video_Intercom, Hilton_Bathroom, Intercom_System, Double_Glazing, Jacuzzi, Plasterboard, Pantry,
        Air_Conditioner, Bathtub, Laminate_Flooring, Marley_Flooring, Furniture, Shutter, Parquet_Flooring, PVC_Joinery,
        Ceramic_Flooring, Spot_Lighting, Terrace, Fireplace, Water_Heater, Vestibule, Face_Recognition_And_Fingerprint
    }

    public enum ExternalFeatures {
        Vehicle_Charging_Station,
        Security,
        Building_Superintendent,
        Steam_Room,
        Childrens_Playground,
        Turkish_Bath,
        Booster_Pump,
        Thermal_Insulation,
        Generator,
        Cable_TV,
        Camera_System,
        Daycare_Center,
        Private_Pool,
        Sauna,
        Sound_Insulation,
        Siding,
        Sports_Area,
        Water_Tank,
        Tennis_Court,
        Satellite,
        Fire_Escape,
        Outdoor_Swimming_Pool,
        Indoor_Swimming_Pool
    }

    public enum NeighborhoodFeatures {
        Shopping_Mall,
        Municipality,
        Mosque,
        Seaside_And_Lakefront,
        Pharmacy,
        Hospital,
        Primary_School,
        Secondary_School,
        High_School,
        Market,
        Park,
        Beach,
        Police_Station,
        Clinic,
        Neighborhood_Market,
        Gym,
        City_Center,
        University
    }

    public enum Transportation {
        Highway,
        Eurasia_Tunnel,
        Bosporus_Bridges,
        Street,
        Ferry,
        Minibus,
        E_5,
        Airport,
        Pier,
        Marmaray,
        Subway,
        Metrobus,
        Bus_Stop,
        Coast,
        Cable_Car,
        TEM,
        Tram,
        Train_Station
    }

    public enum Landscape {
        Bosphorus,
        Sea,
        Nature,
        Lake,
        Pool,
        Park_And_Green_Area,
        City
    }

    public enum ApartmentType {
        Middle_Floor,
        Duplex_Middle_Floor,
        Garden_Duplex,
        Garden_Floor,
        Garden,
        Penthouse,
        Top_Floor,
        Forelex,
        Above_Garage_And_Shop,
        Entrance_Floor,
        Duplex_Apartment,
        Loft,
        Detached_Entrance,
        Reverse_Duplex,
        Triplex,
        Ground_Floor
    }

    public enum Currencies {
        Dollar,
        Euro,
        TL
    }

    public enum ZoningStatus {
        Plot,
        Land,
        Garden,
        Warehouse,
        Education,
        Energy_Storage,
        Housing,
        Miscellaneous,
        Private_Use,
        Health,
        Industry,
        Greenhouse,
        Conservation_Area,
        Sports_Area,
        Field,
        Commercial,
        Mass_Housing,
        Tourism,
        Villa,
        Olive_Grove
    }

    public enum DeedStatus {
        Shared_Deed,
        Independent_Parcel,
        Allocation,
        Possession
    }

    public enum FloorEquivalent {
        Yes,
        No
    }

    public enum Infrastructure {
        Electricity,
        Industrial_Electricity,
        Water,
        Phone,
        Natural_Gas,
        Sewer,
        Treatment,
        Drilling,
        Ground_Study,
        Road_Opened,
        Road_Not_Opened,
        No_Road
    }

    public enum LocationPlot {
        Close_To_Main_Road,
        Seafront,
        Close_To_Airport,
        Close_To_Public_Transport
    }

    public enum GeneralFeatures {
        Subdivided,
        Parcelled,
        Projected,
        Corner_Parcel
    }

    public enum TurkishCity {
        Adana, Adiyaman, Afyonkarahisar, Agri, Amasya, Ankara, Antalya, Artvin, Aydin, Balikesir, Bilecik,
        Bingol, Bitlis, Bolu, Burdur, Bursa, Canakkale, Cankiri, Corum, Denizli, Diyarbakir, Edirne,
        Elazig, Erzincan, Erzurum, Eskisehir, Gaziantep, Giresun, Gumushane, Hakkari, Hatay, Isparta,
        Mersin, Istanbul, Izmir, Kars, Kastamonu, Kayseri, Kirklareli, Kirsehir, Kocaeli, Konya, Kutahya,
        Malatya, Manisa, Kahramanmaras, Mardin, Mugla, Mus, Nevsehir, Nigde, Ordu, Rize, Sakarya,
        Samsun, Siirt, Sinop, Sivas, Tekirdag, Tokat, Trabzon, Tunceli, Sanliurfa, Usak, Van, Yozgat,
        Zonguldak, Aksaray, Bayburt, Karaman, Kirikkale, Batman, Sirnak, Bartin, Ardahan, Igdir, Yalova,
        Karabuk, Kilis, Osmaniye, Duzce;
    }

}
