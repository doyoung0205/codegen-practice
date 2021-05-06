package me.doyoung.study.apifirstdesign.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecruitCreateModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-06T20:33:33.584+09:00")

public class RecruitCreateModel   {
  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("contents")
  private String contents = null;

  @JsonProperty("deadlineDate")
  private LocalDateTime deadlineDate = null;

  public RecruitCreateModel creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public RecruitCreateModel title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=2,max=30) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecruitCreateModel contents(String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Get contents
   * @return contents
  **/
  @ApiModelProperty(value = "")


  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public RecruitCreateModel deadlineDate(LocalDateTime deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }

  /**
   * Get deadlineDate
   * @return deadlineDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDateTime getDeadlineDate() {
    return deadlineDate;
  }

  public void setDeadlineDate(LocalDateTime deadlineDate) {
    this.deadlineDate = deadlineDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitCreateModel recruitCreateModel = (RecruitCreateModel) o;
    return Objects.equals(this.creator, recruitCreateModel.creator) &&
        Objects.equals(this.title, recruitCreateModel.title) &&
        Objects.equals(this.contents, recruitCreateModel.contents) &&
        Objects.equals(this.deadlineDate, recruitCreateModel.deadlineDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, title, contents, deadlineDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitCreateModel {\n");
    
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
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

