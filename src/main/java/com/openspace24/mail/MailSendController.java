package com.openspace24.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSendController {

	@Autowired
	public EmailServiceImpl emailService;

	@Autowired
	private EmailServiceImpl emailServiceImpl;

	@RequestMapping(value = "mail/send/simple", method = RequestMethod.POST)
	public BaseResponse sendMail(@RequestParam String receiverEmail, @RequestParam String mailSubject,@RequestParam String mailBody) {

		emailServiceImpl.sendSimpleMessage(receiverEmail, mailSubject, mailBody);
		return new BaseResponse("Mail Send Success");
	}
	
	
	@RequestMapping(value = "mail/send/with/attachment", method = RequestMethod.POST)
	public BaseResponse sendMailWithAttachment(@RequestParam String receiverEmail, @RequestParam String mailSubject,@RequestParam String mailBody,@RequestParam(required = false) String filePath) {

		emailServiceImpl.sendMessageWithAttachment(receiverEmail, mailSubject, mailBody, "/home/nasir/license.pdf");
		return new BaseResponse("Mail Send Success with attachment");
	}

}
