/*
 * task_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package nextflow.ga4gh.tes.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Ports describes the port mapping between the container and host.
 */
@ApiModel(description = "Ports describes the port mapping between the container and host.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-21T14:19:55.302Z")
public class TesPorts {
  @SerializedName("container")
  private Long container = null;

  @SerializedName("host")
  private Long host = null;

  public TesPorts container(Long container) {
    this.container = container;
    return this;
  }

   /**
   * Port number opened inside the container.
   * @return container
  **/
  @ApiModelProperty(value = "Port number opened inside the container.")
  public Long getContainer() {
    return container;
  }

  public void setContainer(Long container) {
    this.container = container;
  }

  public TesPorts host(Long host) {
    this.host = host;
    return this;
  }

   /**
   * Port number opened on the host. Must be greater than 1024. Defaults to 0, which assigns a random port on the host.
   * @return host
  **/
  @ApiModelProperty(value = "Port number opened on the host. Must be greater than 1024. Defaults to 0, which assigns a random port on the host.")
  public Long getHost() {
    return host;
  }

  public void setHost(Long host) {
    this.host = host;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesPorts tesPorts = (TesPorts) o;
    return Objects.equals(this.container, tesPorts.container) &&
        Objects.equals(this.host, tesPorts.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, host);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesPorts {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
