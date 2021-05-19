public enum ItemType {

	Zbran {
		@Override
		public String printItemType() {
			return "Zbra�";
		}
	},

	Stit {
		@Override
		public String printItemType() {
			return "�t�t";
		}
	},

	Odev {
		@Override
		public String printItemType() {
			return "Od�v";
		}
	},

	Sperk {
		@Override
		public String printItemType() {
			return "�perk";
		}
	},

	Lektvar {
		@Override
		public String printItemType() {
			return "Lektvar";
		}
	},

	J�dlo {
		@Override
		public String printItemType() {
			return "J�dlo";
		}
	};

	public abstract String printItemType();
}
