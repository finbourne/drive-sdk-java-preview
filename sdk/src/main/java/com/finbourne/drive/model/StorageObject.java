/*
 * FINBOURNE Drive API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.350
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.drive.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.drive.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representation of a drive file or folder
 */
@ApiModel(description = "An object representation of a drive file or folder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StorageObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updatedOn";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private OffsetDateTime updatedOn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DETAIL = "statusDetail";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAIL)
  private String statusDetail;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public StorageObject id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * File or folder identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "File or folder identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public StorageObject path(String path) {
    this.path = path; 
    return this;
  }

   /**
   * Path of the folder or file
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path of the folder or file")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public StorageObject name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Name of the folder or file
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the folder or file")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public StorageObject createdBy(String createdBy) {
    this.createdBy = createdBy; 
    return this;
  }

   /**
   * Identifier of the user who created the file or folder
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Identifier of the user who created the file or folder")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public StorageObject createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn; 
    return this;
  }

   /**
   * Date of file/folder creation
   * @return createdOn
  **/
  @ApiModelProperty(required = true, value = "Date of file/folder creation")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public StorageObject updatedBy(String updatedBy) {
    this.updatedBy = updatedBy; 
    return this;
  }

   /**
   * Identifier of the last user to modify the file or folder
   * @return updatedBy
  **/
  @ApiModelProperty(required = true, value = "Identifier of the last user to modify the file or folder")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  public StorageObject updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn; 
    return this;
  }

   /**
   * Date of file/folder modification
   * @return updatedOn
  **/
  @ApiModelProperty(required = true, value = "Date of file/folder modification")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  public StorageObject type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * Type of storage object (file or folder)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of storage object (file or folder)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public StorageObject size(Integer size) {
    this.size = size; 
    return this;
  }

   /**
   * Size of the file in bytes
   * @return size
  **/
  @ApiModelProperty(value = "Size of the file in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  public StorageObject status(String status) {
    this.status = status; 
    return this;
  }

   /**
   * File status corresponding to virus scan status.  (Active, Available, Checking, MalwareDetected, Failed)
   * @return status
  **/
  @ApiModelProperty(value = "File status corresponding to virus scan status.  (Active, Available, Checking, MalwareDetected, Failed)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public StorageObject statusDetail(String statusDetail) {
    this.statusDetail = statusDetail; 
    return this;
  }

   /**
   * Detailed description describing any negative terminal state of file
   * @return statusDetail
  **/
  @ApiModelProperty(value = "Detailed description describing any negative terminal state of file")
  public String getStatusDetail() {
    return statusDetail;
  }

  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }


  public StorageObject links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public StorageObject addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
