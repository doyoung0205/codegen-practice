package me.doyoung.study.apifirstdesign.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import me.doyoung.study.apifirstdesign.models.InquiryModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecruitModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-06T20:33:33.584+09:00")

public class RecruitModel   {
  @JsonProperty("recruitId")
  private String recruitId = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("contents")
  private String contents = null;

  @JsonProperty("deadlineDate")
  private LocalDateTime deadlineDate = null;

  @JsonProperty("inquires")
  @Valid
  private List<InquiryModel> inquires = null;

  /**
   * 모집의 상태를 나타내며, 모집을 처음 생성시 START, 사람을 모일 수 있는 상태를 BEGIN, 모집의 종료를 나타내는 FINISH
   */
  public enum StatusEnum {
    START("START"),
    
    BEGIN("BEGIN"),
    
    FINISH("FINISH");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public RecruitModel recruitId(String recruitId) {
    this.recruitId = recruitId;
    return this;
  }

  /**
   * 모집을 식별하기 위한 ID
   * @return recruitId
  **/
  @ApiModelProperty(required = true, value = "모집을 식별하기 위한 ID")
  @NotNull


  public String getRecruitId() {
    return recruitId;
  }

  public void setRecruitId(String recruitId) {
    this.recruitId = recruitId;
  }

  public RecruitModel creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 모집을 만든 사람
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "모집을 만든 사람")
  @NotNull


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public RecruitModel title(String title) {
    this.title = title;
    return this;
  }

  /**
   * 모집의 제목
   * @return title
  **/
  @ApiModelProperty(required = true, value = "모집의 제목")
  @NotNull

@Size(min=2,max=30) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecruitModel contents(String contents) {
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

  public RecruitModel deadlineDate(LocalDateTime deadlineDate) {
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

  public RecruitModel inquires(List<InquiryModel> inquires) {
    this.inquires = inquires;
    return this;
  }

  public RecruitModel addInquiresItem(InquiryModel inquiresItem) {
    if (this.inquires == null) {
      this.inquires = new ArrayList<>();
    }
    this.inquires.add(inquiresItem);
    return this;
  }

  /**
   * 모집의 질의문
   * @return inquires
  **/
  @ApiModelProperty(value = "모집의 질의문")

  @Valid

  public List<InquiryModel> getInquires() {
    return inquires;
  }

  public void setInquires(List<InquiryModel> inquires) {
    this.inquires = inquires;
  }

  public RecruitModel status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * 모집의 상태를 나타내며, 모집을 처음 생성시 START, 사람을 모일 수 있는 상태를 BEGIN, 모집의 종료를 나타내는 FINISH
   * @return status
  **/
  @ApiModelProperty(value = "모집의 상태를 나타내며, 모집을 처음 생성시 START, 사람을 모일 수 있는 상태를 BEGIN, 모집의 종료를 나타내는 FINISH")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitModel recruitModel = (RecruitModel) o;
    return Objects.equals(this.recruitId, recruitModel.recruitId) &&
        Objects.equals(this.creator, recruitModel.creator) &&
        Objects.equals(this.title, recruitModel.title) &&
        Objects.equals(this.contents, recruitModel.contents) &&
        Objects.equals(this.deadlineDate, recruitModel.deadlineDate) &&
        Objects.equals(this.inquires, recruitModel.inquires) &&
        Objects.equals(this.status, recruitModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recruitId, creator, title, contents, deadlineDate, inquires, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitModel {\n");
    
    sb.append("    recruitId: ").append(toIndentedString(recruitId)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    inquires: ").append(toIndentedString(inquires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

