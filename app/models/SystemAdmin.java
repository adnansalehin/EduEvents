package models;

public class SystemAdmin {

	private MemberInventory memberInventory = memberInventory.getInstance();
	private EventInventory eventInventory = eventInventory.getInstance();
	private TagInventory tagInventory = tagInventory.getInstance();
	private ReportInventory reportInventory = reportInventory.getInstance();

	public removeEvent(Event event) {
		eventInventory.remove(event);
	}

	public banMember(Member member) {
		memberInventory.get(member).setBanned(true);
	}

	public unbanMember(Member member) {
		memberInventory.get(member).setBanned(false);
	}

	/**
	 * Returns value of memberInventory
	 *
	 * @return
	 */
	public MemberInventory getMemberInventory() {
		return memberInventory;
	}

	/**
	 * Sets new value of memberInventory
	 *
	 * @param
	 */
	public void setMemberInventory(MemberInventory memberInventory) {
		this.memberInventory = memberInventory;
	}

	/**
	 * Returns value of eventInventory
	 *
	 * @return
	 */
	public EventInventory getEventInventory() {
		return eventInventory;
	}

	/**
	 * Sets new value of eventInventory
	 *
	 * @param
	 */
	public void setEventInventory(EventInventory eventInventory) {
		this.eventInventory = eventInventory;
	}

	/**
	 * Returns value of tagInventory
	 *
	 * @return
	 */
	public TagInventory getTagInventory() {
		return tagInventory;
	}

	/**
	 * Sets new value of tagInventory
	 *
	 * @param
	 */
	public void setTagInventory(TagInventory tagInventory) {
		this.tagInventory = tagInventory;
	}

	/**
	 * Returns value of reportInventory
	 *
	 * @return
	 */
	public ReportInventory getReportInventory() {
		return reportInventory;
	}

	/**
	 * Sets new value of reportInventory
	 *
	 * @param
	 */
	public void setReportInventory(ReportInventory reportInventory) {
		this.reportInventory = reportInventory;
	}
}