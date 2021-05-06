package me.doyoung.study.apifirstdesign.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InquiryModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-06T20:33:33.584+09:00")

public class InquiryModel   {
  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("question")
  private String question = null;

  @JsonProperty("required")
  private Boolean required = false;

  public InquiryModel creator(String creator) {
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

  public InquiryModel question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public InquiryModel required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InquiryModel inquiryModel = (InquiryModel) o;
    return Objects.equals(this.creator, inquiryModel.creator) &&
        Objects.equals(this.question, inquiryModel.question) &&
        Objects.equals(this.required, inquiryModel.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, question, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InquiryModel {\n");
    
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

