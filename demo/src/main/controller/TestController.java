package com.vms.app.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vms.app.dto.CompanyDto;
import com.vms.app.dto.UserDto;
import com.vms.app.entity.Appointment;
import com.vms.app.entity.AppointmentPeriodOfUse;
import com.vms.app.entity.AppointmentRequestResult;
import com.vms.app.entity.Company;
import com.vms.app.entity.Notice;
import com.vms.app.entity.Setting;
import com.vms.app.entity.User;
import com.vms.app.repository.AppointmentPeriodOfUseRepository;
import com.vms.app.repository.AppointmentRepository;
import com.vms.app.repository.AppointmentRequestResultRepository;
import com.vms.app.repository.CompanyRepository;
import com.vms.app.repository.NoticeRepository;
import com.vms.app.repository.SettingRepository;
import com.vms.app.repository.UserRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;

// 프로토타입 개발중 간단한 데이터 확인을 위한 test컨트롤러

@RestController
@RequestMapping
// @Tag(name = "bear controller", description = "bear controller desc")
public class TestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
