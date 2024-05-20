package com.example.vendor.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.cache.CacheProperties.Couchbase;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendor.model.CloudVendor;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

	CloudVendor cloudVendor;

	@RequestMapping("/")
	public String hello() {
		return "namaste";

	}

	@RequestMapping("/{vendorId}")
	public CloudVendor getVendorInfo(String vendorId) {
	//	 return new CloudVendor("3","fssccvsvf","dfetrbdfb","dfbbbbbbdf");
		return cloudVendor;
	}

	@PostMapping("/{vendorId}")
	public String setVendorInfo(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "set";

	}

	@PutMapping("/{vendorId}")
	public String updateVendorInfo(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "updated";

	}

	@DeleteMapping("/{vendorId}")
	public String deleteVendor(String vendorId) {

		this.cloudVendor=cloudVendor;
		return "record Deleted";

	}

}
