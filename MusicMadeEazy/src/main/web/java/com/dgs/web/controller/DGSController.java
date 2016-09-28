package com.dgs.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dgs.business.service.DGSService;
import com.dgs.data.domain.MmePlaylist;
import com.dgs.data.domain.MmeSongs;
import com.dgs.data.domain.MmeUser;
import com.dgs.infra.dto.login.UserDTO;
import com.dgs.infra.misc.wrapper.ResponseMessageWrapper;
import com.dgs.web.constants.DGSWebConstants;
import com.dgs.web.util.RESTUtil;

@Controller
public class DGSController {

	@Autowired
	RESTUtil restUtil;

	@Autowired
	DGSService dgsService;

	private static final Logger LOG = LoggerFactory
			.getLogger(LoginController.class);

	// Render courses page
	@RequestMapping(value = "/drexel/allsongs", method = RequestMethod.GET)
	public String showSongsPage() {
		return DGSWebConstants.DGS.ALL_SONGS_PAGE_PATH;
	}
	
	// Render courses page
		@RequestMapping(value = "/drexel/allusers", method = RequestMethod.GET)
		public String showUsersPage() {
			return DGSWebConstants.DGS.ALL_USERS_PAGE_PATH;
		}

	// Render grade courses page
	@RequestMapping(value = "/drexel/myplaylists", method = RequestMethod.GET)
	public String showGradeCoursePage() {
		return DGSWebConstants.DGS.MY_PLAYLISTS_PAGE_PATH;
	}

	// Render grade Student page
	@RequestMapping(value = "/drexel/gradestudent", method = RequestMethod.GET)
	public String showGradeStudentPage() {
		return DGSWebConstants.DGS.GRADE_STUDENT_PAGE_PATH;
	}

	// Render user home page
	@RequestMapping(value = "/drexel/userhome", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String showUserHomePage() {
		return DGSWebConstants.Login.WELCOME_PAGE_PATH;

	}
	@RequestMapping(value = "/drexel/development", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String showDevelopmentPage() {
		return DGSWebConstants.DGS.DEVELOPMENT_PAGE_PATH;

	}
	
	
	
	@RequestMapping(value = "/drexel/getallsongs", method = RequestMethod.GET)
	public @ResponseBody List<MmeSongs> getAllSongs() {
		LOG.debug("getallsongs() called from controller");
		List<MmeSongs> songs = new ArrayList<MmeSongs>();
		ResponseMessageWrapper responseMessageWrapper = new ResponseMessageWrapper();
		try {
			songs = dgsService.getAllSongs();

		} catch (Exception e) {
			LOG.debug("Error in getting my course details:" + e);
			e.printStackTrace();
			responseMessageWrapper
					.setResponseMessage("Error in getting courses details");

		}

		return songs;

	}

	
	@RequestMapping(value = "/drexel/getallusers", method = RequestMethod.GET)
	public @ResponseBody List<MmeUser> getAllUsers() {
		LOG.debug("getallusers() called from controller");
		List<MmeUser> users = new ArrayList<MmeUser>();
		ResponseMessageWrapper responseMessageWrapper = new ResponseMessageWrapper();
		try {
			users = dgsService.getAllUsers();

		} catch (Exception e) {
			LOG.debug("Error in getting my course details:" + e);
			e.printStackTrace();
			responseMessageWrapper
					.setResponseMessage("Error in getting courses details");

		}

		return users;

	}

	@RequestMapping(value = "/drexel/getmyplaylists", method = RequestMethod.GET)
	public @ResponseBody List<MmePlaylist> getMyPlaylists(
			@RequestParam(value = "id", required = false) final long id) {
		LOG.debug("getmyplaylistss() called from controller");
		List<MmePlaylist> myPlaylists = new ArrayList<MmePlaylist>();
		ResponseMessageWrapper responseMessageWrapper = new ResponseMessageWrapper();
		try {
			myPlaylists = dgsService.getMyPlaylists(id);

		} catch (Exception e) {
			LOG.debug("Error in getting grade details:" + e);
			e.printStackTrace();
			responseMessageWrapper
					.setResponseMessage("Error in getting courses details");

		}

		return myPlaylists;

	}

	
	@RequestMapping(value = "/drexel/deletemyplaylist", method = RequestMethod.GET)
	public String deleteMyPlaylist(
			@RequestParam(value = "id", required = false) final long id) {
		LOG.debug("getmyplaylistss() called from controller");
		ResponseMessageWrapper responseMessageWrapper = new ResponseMessageWrapper();
		try {
			dgsService.deletePlaylist(id);

		} catch (Exception e) {
			LOG.debug("Error in getting grade details:" + e);
			e.printStackTrace();
			responseMessageWrapper
					.setResponseMessage("Error in getting courses details");

		}

		return DGSWebConstants.DGS.MY_PLAYLISTS_PAGE_PATH;

	}

	
	@RequestMapping(value = "/drexel/createPlaylist", method = RequestMethod.POST)
	public String savePlaylist(@ModelAttribute @Valid MmePlaylist mmePlaylist,
	BindingResult result, HttpServletRequest request) {
		LOG.debug("savePlaylist() called from controller");

			try {
				dgsService.savePlaylist(mmePlaylist);
			} catch (Exception e) {
				LOG.debug("Error in submitting TRF:" + e);
				e.printStackTrace();
				
			}

		
		return DGSWebConstants.DGS.MY_PLAYLISTS_PAGE_PATH;
	}

}
