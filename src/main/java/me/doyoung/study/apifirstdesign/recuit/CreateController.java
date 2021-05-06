package me.doyoung.study.apifirstdesign.recuit;

import me.doyoung.study.apifirstdesign.apis.RecruitCreateApi;
import me.doyoung.study.apifirstdesign.models.RecruitCreateModel;
import me.doyoung.study.apifirstdesign.models.RecruitModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;


@RestController
public class CreateController implements RecruitCreateApi {

    @Override
    public ResponseEntity<RecruitModel> createRecruit(@Valid RecruitCreateModel body) {

        RecruitModel model = new RecruitModel();
        if (body.getDeadlineDate().isBefore(LocalDateTime.now())) {
            return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(model, HttpStatus.OK);

    }
}