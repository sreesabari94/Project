DROP TABLE IF EXISTS plasma_donor;

CREATE TABLE plasma_donor
(ID bigint auto_increment, FIRST_NAME NVARCHAR(100), LAST_NAME NVARCHAR(100), EMAIL NVARCHAR(100),
CONTACT_NUMBER NVARCHAR(100), BLOOD_GROUP NVARCHAR(3), CITY NVARCHAR(50), DONATION_DATE DATE, PRIMARY KEY (ID))