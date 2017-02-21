/**
 * 
 */
package com.shyam.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.beans.SvcReq;
import com.shyam.beans.SvcResp;

/**
 * @author svadikari
 *
 */
@RestController
public class PhoneController {
	
	@PostMapping(path="/phone/order")
	public SvcResp orderPhone(@RequestBody SvcReq svcReq) {
		SvcResp svcResp = new SvcResp();
		svcResp.setId(svcReq.getId());
		svcResp.setMessage("Phone Order Created for:: "+svcReq.getId());
		return svcResp;
	}

}
