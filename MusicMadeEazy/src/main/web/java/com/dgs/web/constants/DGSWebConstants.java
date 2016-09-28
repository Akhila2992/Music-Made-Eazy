package com.dgs.web.constants;



public interface DGSWebConstants {

	
	static interface Login{

		// Paths to JSP pages
		public static final String LOGIN_PAGE_PATH = "login/login";
		public static final String WELCOME_PAGE_PATH = "/user/userhome";
		

		// Paths to RESTful Web Services
		public static final String LOGIN_WS_PAGE_PATH = "/login/userdetails";
	
	}
	
	static interface DGS{
	
		//Paths to JSP pages
		public static final String GRADE_STUDENT_PAGE_PATH = "drexel/gradestudent";
		public static final String ALL_SONGS_PAGE_PATH = "drexel/allsongs";
		public static final String MY_PLAYLISTS_PAGE_PATH = "drexel/myplaylists";
		public static final String ALL_USERS_PAGE_PATH = "drexel/allusers";
		public static final String DEVELOPMENT_PAGE_PATH = "drexel/development";
			
				
		
		// Paths to RESTful Web Services
		public static final String GET_CONFIG_DETAILS = "/drexel/getconfigvalues";
		public static final String GET_COURSE_DETAILS = "/drexel/getcoursedetails";
		public static final String GET_ALL_SONGS = "/drexel/getallsongs";
		public static final String GET_ALL_USERS = "/drexel/getallusers";
		public static final String GET_MY_PLAYLISTS_DETAILS = "/drexel/getmyplaylists";
		public static final String GET_STUDENT_DETAILS = "/drexel/getmystudents";
		public static final String GET_GRADE_DETAILS = "/drexel/getgrade";
	
	}

}
