package com.google.appinventor.common.version;

public final class GitBuildId
{
  public static final String ACRA_URI = "https://acra2.appinventor.mit.edu/acra/";
  public static final String ANT_BUILD_DATE = "October 1 2015";
  public static final String GIT_BUILD_FINGERPRINT = "0a6023b8f11ea8e358502b95922cc84dd975ec86";
  public static final String GIT_BUILD_VERSION = "nb146a";
  
  public static String getAcraUri()
  {
    if ("https://acra2.appinventor.mit.edu/acra/".equals("${acra.uri}")) {
      return "";
    }
    return "https://acra2.appinventor.mit.edu/acra/".trim();
  }
  
  public static String getDate()
  {
    return "October 1 2015";
  }
  
  public static String getFingerprint()
  {
    return "0a6023b8f11ea8e358502b95922cc84dd975ec86";
  }
  
  public static String getVersion()
  {
    String str = "nb146a";
    if (("nb146a" == "") || ("nb146a".contains(" "))) {
      str = "none";
    }
    return str;
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/com/google/appinventor/common/version/GitBuildId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */