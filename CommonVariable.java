package com.iih.android.videoblog.commonutill;

public class CommonVariable {

	private static CommonVariable instance = null;
	private String Category_id, post_id, member_id, imgfile_path, Profiler_id,file_Type,GCM_id;
	private Object CountryJson,StateJason;

	public synchronized static CommonVariable getInstance() {
		if (instance == null) {
			instance = new CommonVariable();
		}
		return instance;
	}

	public String getCategoryId() {
		return Category_id;
	}

	public void setCategoryId(String category_id) {
		this.Category_id = category_id;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getProfiler_id() {
		return Profiler_id;
	}

	public void setProfiler_id(String profiler_id) {
		this.Profiler_id = profiler_id;
	}

	public String getFilePath() {

		return imgfile_path;
	}

	public void setFilePath(String imgfile_path) {
		this.imgfile_path = imgfile_path;
	}
	
	public String getFileType() {

		return file_Type;
	}

	public void setFileType(String file_Type) {
		this.file_Type = file_Type;
	}
	public void setcountry(Object CountryJson) {
		this.CountryJson = CountryJson;
	}
	public Object getcountry() {

		return CountryJson;
	}
	public void setState(Object StateJason) {
		this.StateJason = StateJason;
	}
	public Object getState() {

		return StateJason;
	}
	
	public void setGCM_id(String GCM_id) {
		this.GCM_id = GCM_id;
	}

	public String getGCM_id() {
		return GCM_id;
	}
	
	public void clear() {
		instance = null;
	}

}
