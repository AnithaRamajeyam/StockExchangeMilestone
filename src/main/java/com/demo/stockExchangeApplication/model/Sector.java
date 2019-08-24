package com.demo.stockExchangeApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sector")
public class Sector {
	
		@Id
		private int sectorid;
		private String sectorname;
		private String brief;
		public int getSectorid() {
			return sectorid;
		}
		public void setSectorid(int sectorid) {
			this.sectorid = sectorid;
		}
		public String getSectorname() {
			return sectorname;
		}
		public void setSectorname(String sectorname) {
			this.sectorname = sectorname;
		}
		public String getBrief() {
			return brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		
		
		
}
