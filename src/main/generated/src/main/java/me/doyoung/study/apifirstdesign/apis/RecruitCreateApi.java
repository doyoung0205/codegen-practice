/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package me.doyoung.study.apifirstdesign.apis;

import me.doyoung.study.apifirstdesign.models.BadRequestError;
import me.doyoung.study.apifirstdesign.models.InternalServerError;
import me.doyoung.study.apifirstdesign.models.RecruitCreateModel;
import me.doyoung.study.apifirstdesign.models.RecruitModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-06T20:33:33.584+09:00")

@Api(value = "RecruitCreate", description = "the RecruitCreate API")
public interface RecruitCreateApi {

    Logger log = LoggerFactory.getLogger(RecruitCreateApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "새로운 모집을 생성합니다.", nickname = "createRecruit", notes = "새로운 모집을 생성합니다.", response = RecruitModel.class, tags={ "recruitCreate", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "성공적으로 모집을 생성했음.", response = RecruitModel.class),
        @ApiResponse(code = 400, message = "BadRequest", response = BadRequestError.class),
        @ApiResponse(code = 500, message = "InternalServerError", response = InternalServerError.class) })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/recruits",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<RecruitModel> createRecruit(@ApiParam(value = "Recruit를 생성하기 위한 요소을 포함합니다." ,required=true )  @Valid @RequestBody RecruitCreateModel body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"creator\" : \"creator\",  \"contents\" : \"contents\",  \"deadlineDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"recruitId\" : \"recruitId\",  \"title\" : \"title\",  \"inquires\" : [ {    \"creator\" : \"creator\",    \"question\" : \"question\",    \"required\" : false  }, {    \"creator\" : \"creator\",    \"question\" : \"question\",    \"required\" : false  } ],  \"status\" : \"START\"}", RecruitModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RecruitCreateApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}