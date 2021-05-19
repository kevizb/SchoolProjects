public enum ItemType {

	Zbran {
		@Override
		public String printItemType() {
			return "Zbraò";
		}
	},

	Stit {
		@Override
		public String printItemType() {
			return "Štít";
		}
	},

	Odev {
		@Override
		public String printItemType() {
			return "Odìv";
		}
	},

	Sperk {
		@Override
		public String printItemType() {
			return "Šperk";
		}
	},

	Lektvar {
		@Override
		public String printItemType() {
			return "Lektvar";
		}
	},

	Jídlo {
		@Override
		public String printItemType() {
			return "Jídlo";
		}
	};

	public abstract String printItemType();
}
