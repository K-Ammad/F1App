public class Circuits
{
        private int     circuitId ;
        private String  circuitRef;
        private String  circuitName;
        private String  circuitLocation;
        private String  country;
        private double  latitude;
        private double  longitude;
        private int     alt;

        public Circuits (int pCircuitId, String pCircuitRef, String pCircuitName, String pCircuitLocation, String pCountry, double pLatitude, double pLongitude, int pAlt)
        {
                circuitId = pCircuitId;
                circuitRef = pCircuitRef;
                circuitName = pCircuitName;
                circuitLocation = pCircuitLocation;
                country = pCountry;
                latitude = pLatitude;
                longitude = pLongitude;
                alt = pAlt;
        }

        public int getCircuitId()
        {return circuitId;}

        public String getCircuitRef()
        {return circuitRef;}

        public String getCircuitName()
        {return circuitName;}

        public String getCircuitLocation()
        {return circuitLocation;}

        public String getCountry()
        {return country;}
        
        public double getLatitude()
        {return latitude;}

        public double getLongitude()
        {return longitude;}

        public int getAlt()
        {return alt;}
}


