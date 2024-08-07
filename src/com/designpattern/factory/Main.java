package com.designpattern.factory;

import com.designpattern.factory.Main.Config.OS;
import com.designpattern.factory.dao.Dialog;
import com.designpattern.factory.dao.HTMLDialog;
import com.designpattern.factory.dao.WindowsDialog;

public class Main {

	private static Dialog dialog;

	public static void main(String[] args) {
		OS configOS = OS.WINDOWS;

		if (configOS.equals(OS.WINDOWS)) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HTMLDialog();
		}

		dialog.render();
	}

	class Config {
		enum OS {
			WINDOWS, WEB
		}
	}

}
