package water.webserver.iface;

/**
 * Holds configuration relevant to HTTP server.
 */
public class H2OHttpConfig {

  /**
   * Prefix of hidden system properties, same as in H2O.OptArgs.SYSTEM_PROP_PREFIX.
   */
  public static final String SYSTEM_PROP_PREFIX = "sys.ai.h2o.";

  public String jks;

  public String jks_pass;

  public String jks_alias;

  public LoginType loginType;

  public String login_conf;

  public String spnego_properties;

  public boolean form_auth;

  public int session_timeout; // parsed value (in minutes)

  public String user_name;

  public String context_path;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    H2OHttpConfig that = (H2OHttpConfig) o;

    if (form_auth != that.form_auth) return false;
    if (session_timeout != that.session_timeout) return false;
    if (jks != null ? !jks.equals(that.jks) : that.jks != null) return false;
    if (jks_pass != null ? !jks_pass.equals(that.jks_pass) : that.jks_pass != null) return false;
    if (jks_alias != null ? !jks_alias.equals(that.jks_alias) : that.jks_alias != null) return false;
    if (loginType != that.loginType) return false;
    if (login_conf != null ? !login_conf.equals(that.login_conf) : that.login_conf != null) return false;
    if (spnego_properties != null ? !spnego_properties.equals(that.spnego_properties) : that.spnego_properties != null)
      return false;
    if (user_name != null ? !user_name.equals(that.user_name) : that.user_name != null) return false;
    return context_path != null ? context_path.equals(that.context_path) : that.context_path == null;
  }

  @Override
  public int hashCode() {
    int result = jks != null ? jks.hashCode() : 0;
    result = 31 * result + (jks_pass != null ? jks_pass.hashCode() : 0);
    result = 31 * result + (jks_alias != null ? jks_alias.hashCode() : 0);
    result = 31 * result + (loginType != null ? loginType.hashCode() : 0);
    result = 31 * result + (login_conf != null ? login_conf.hashCode() : 0);
    result = 31 * result + (spnego_properties != null ? spnego_properties.hashCode() : 0);
    result = 31 * result + (form_auth ? 1 : 0);
    result = 31 * result + session_timeout;
    result = 31 * result + (user_name != null ? user_name.hashCode() : 0);
    result = 31 * result + (context_path != null ? context_path.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "H2OHttpConfig{" +
            "jks='" + jks + '\'' +
            ", jks_pass='" + jks_pass + '\'' +
            ", jks_alias='" + jks_alias + '\'' +
            ", loginType=" + loginType +
            ", login_conf='" + login_conf + '\'' +
            ", spnego_properties='" + spnego_properties + '\'' +
            ", form_auth=" + form_auth +
            ", session_timeout=" + session_timeout +
            ", user_name='" + user_name + '\'' +
            ", context_path='" + context_path + '\'' +
            '}';
  }
}
