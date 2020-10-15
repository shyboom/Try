package com.example.demo.pojo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Employee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-12T12:15:20.272Z[GMT]")


public class Employee   {
  @JsonProperty("empName")
  private String empName ;

  @JsonProperty("empId")
  private Integer empId ;

  @JsonProperty("gender")
  private String gender ;

  @JsonProperty("email")
  private String email ;

  @JsonProperty("dId")
  private Integer dId ;

  public Employee empName(String empName) {
    this.empName = empName;
    return this;
  }

  /**
   * Get empName
   * @return empName
  **/
  @ApiModelProperty(example = "Jack", required = true, value = "")
      @NotNull

    public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Employee empId(Integer empId) {
    this.empId = empId;
    return this;
  }

  /**
   * Get empId
   * @return empId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  public Employee gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "f", value = "")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "example_name@example_url", value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee dId(Integer dId) {
    this.dId = dId;
    return this;
  }

  /**
   * Get dId
   * @return dId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getDId() {
    return dId;
  }

  public void setDId(Integer dId) {
    this.dId = dId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.empName, employee.empName) &&
        Objects.equals(this.empId, employee.empId) &&
        Objects.equals(this.gender, employee.gender) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.dId, employee.dId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empName, empId, gender, email, dId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    empName: ").append(toIndentedString(empName)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dId: ").append(toIndentedString(dId)).append("\n");
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
