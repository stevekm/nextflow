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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task describes an instance of a task.
 */
@ApiModel(description = "Task describes an instance of a task.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-21T14:19:55.302Z")
public class OUTPUTONLYTasks {
  @SerializedName("id")
  private String id = null;

  /**
   * Task states.   - PAUSED: An implementation *may* have the ability to pause a task, but this is not required.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    UNKNOWN("UNKNOWN"),
    
    QUEUED("QUEUED"),
    
    INITIALIZING("INITIALIZING"),
    
    RUNNING("RUNNING"),
    
    PAUSED("PAUSED"),
    
    COMPLETE("COMPLETE"),
    
    ERROR("ERROR"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    CANCELED("CANCELED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = StateEnum.UNKNOWN;

  @SerializedName("name")
  private String name = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("inputs")
  private List<OUTPUTONLYInputs> inputs = null;

  @SerializedName("outputs")
  private List<OUTPUTONLYInputs> outputs = null;

  @SerializedName("resources")
  private OUTPUTONLYResources resources = null;

  @SerializedName("executors")
  private List<OUTPUTONLYExecutors> executors = null;

  @SerializedName("volumes")
  private List<String> volumes = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("logs")
  private List<OUTPUTONLY2> logs = null;

  public OUTPUTONLYTasks id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Task identifier assigned by the server.
   * @return id
  **/
  @ApiModelProperty(value = "Task identifier assigned by the server.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OUTPUTONLYTasks state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Task states.   - PAUSED: An implementation *may* have the ability to pause a task, but this is not required.
   * @return state
  **/
  @ApiModelProperty(value = "Task states.   - PAUSED: An implementation *may* have the ability to pause a task, but this is not required.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public OUTPUTONLYTasks name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OUTPUTONLYTasks project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Describes the project this task is associated with. Commonly used for billing on cloud providers (AWS, Google Cloud, etc).
   * @return project
  **/
  @ApiModelProperty(value = "Describes the project this task is associated with. Commonly used for billing on cloud providers (AWS, Google Cloud, etc).")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public OUTPUTONLYTasks description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OUTPUTONLYTasks inputs(List<OUTPUTONLYInputs> inputs) {
    this.inputs = inputs;
    return this;
  }

  public OUTPUTONLYTasks addInputsItem(OUTPUTONLYInputs inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<OUTPUTONLYInputs>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Input files. Inputs will be downloaded and mounted into the executor container.
   * @return inputs
  **/
  @ApiModelProperty(value = "Input files. Inputs will be downloaded and mounted into the executor container.")
  public List<OUTPUTONLYInputs> getInputs() {
    return inputs;
  }

  public void setInputs(List<OUTPUTONLYInputs> inputs) {
    this.inputs = inputs;
  }

  public OUTPUTONLYTasks outputs(List<OUTPUTONLYInputs> outputs) {
    this.outputs = outputs;
    return this;
  }

  public OUTPUTONLYTasks addOutputsItem(OUTPUTONLYInputs outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<OUTPUTONLYInputs>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Output files. Outputs will be uploaded from the executor container to long-term storage.
   * @return outputs
  **/
  @ApiModelProperty(value = "Output files. Outputs will be uploaded from the executor container to long-term storage.")
  public List<OUTPUTONLYInputs> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<OUTPUTONLYInputs> outputs) {
    this.outputs = outputs;
  }

  public OUTPUTONLYTasks resources(OUTPUTONLYResources resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public OUTPUTONLYResources getResources() {
    return resources;
  }

  public void setResources(OUTPUTONLYResources resources) {
    this.resources = resources;
  }

  public OUTPUTONLYTasks executors(List<OUTPUTONLYExecutors> executors) {
    this.executors = executors;
    return this;
  }

  public OUTPUTONLYTasks addExecutorsItem(OUTPUTONLYExecutors executorsItem) {
    if (this.executors == null) {
      this.executors = new ArrayList<OUTPUTONLYExecutors>();
    }
    this.executors.add(executorsItem);
    return this;
  }

   /**
   * A list of executors to be run, sequentially.
   * @return executors
  **/
  @ApiModelProperty(value = "A list of executors to be run, sequentially.")
  public List<OUTPUTONLYExecutors> getExecutors() {
    return executors;
  }

  public void setExecutors(List<OUTPUTONLYExecutors> executors) {
    this.executors = executors;
  }

  public OUTPUTONLYTasks volumes(List<String> volumes) {
    this.volumes = volumes;
    return this;
  }

  public OUTPUTONLYTasks addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<String>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Declared volumes. Volumes are shared between executors. Volumes for inputs and outputs are  inferred and should not be delcared here.
   * @return volumes
  **/
  @ApiModelProperty(value = "Declared volumes. Volumes are shared between executors. Volumes for inputs and outputs are  inferred and should not be delcared here.")
  public List<String> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }

  public OUTPUTONLYTasks tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public OUTPUTONLYTasks putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * A key-value map of arbitrary tags.
   * @return tags
  **/
  @ApiModelProperty(value = "A key-value map of arbitrary tags.")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public OUTPUTONLYTasks logs(List<OUTPUTONLY2> logs) {
    this.logs = logs;
    return this;
  }

  public OUTPUTONLYTasks addLogsItem(OUTPUTONLY2 logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<OUTPUTONLY2>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Task logging information. Normally, this will contain only one entry, but in the case where a task fails and is retried, an entry will be appended to this list.
   * @return logs
  **/
  @ApiModelProperty(value = "Task logging information. Normally, this will contain only one entry, but in the case where a task fails and is retried, an entry will be appended to this list.")
  public List<OUTPUTONLY2> getLogs() {
    return logs;
  }

  public void setLogs(List<OUTPUTONLY2> logs) {
    this.logs = logs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OUTPUTONLYTasks ouTPUTONLYTasks = (OUTPUTONLYTasks) o;
    return Objects.equals(this.id, ouTPUTONLYTasks.id) &&
        Objects.equals(this.state, ouTPUTONLYTasks.state) &&
        Objects.equals(this.name, ouTPUTONLYTasks.name) &&
        Objects.equals(this.project, ouTPUTONLYTasks.project) &&
        Objects.equals(this.description, ouTPUTONLYTasks.description) &&
        Objects.equals(this.inputs, ouTPUTONLYTasks.inputs) &&
        Objects.equals(this.outputs, ouTPUTONLYTasks.outputs) &&
        Objects.equals(this.resources, ouTPUTONLYTasks.resources) &&
        Objects.equals(this.executors, ouTPUTONLYTasks.executors) &&
        Objects.equals(this.volumes, ouTPUTONLYTasks.volumes) &&
        Objects.equals(this.tags, ouTPUTONLYTasks.tags) &&
        Objects.equals(this.logs, ouTPUTONLYTasks.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, name, project, description, inputs, outputs, resources, executors, volumes, tags, logs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OUTPUTONLYTasks {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    executors: ").append(toIndentedString(executors)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
