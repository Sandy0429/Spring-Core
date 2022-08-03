//DBConfig/src/main/java/com/spring/app/DBConfig.java
    package com.spring.app;
    
    public class DBConfig 
    {
        private String driverName;
        private String url;
        private String userName;
        private String password;
        
        public void setDriverName(String driverName)
        {
            this.driverName = driverName;
        }
        public String getDriverName()
        {
            return driverName;
        }
        
        public void setUrl(String url)
        {
            this.url = url;
        }
        public String getUrl()
        {
            return url;
        }
        
        public void setUserName(String userName)
        {
            this.userName = userName;
        }
        public String getUserName()
        {
            return userName;
        }
        
        public void setPassword(String password)
        {
            this.password = password;
        }
        public String getPassword()
        {
            return password;
        }
    
    
    }
