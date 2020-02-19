package eu.ensup.demoFormation.service;

import eu.ensup.demoFormation.dao.FormationDao;
import eu.ensup.demoFormation.domaine.Formation;

public class FormationService implements IFormationService {

	private FormationDao formationdao;

	public FormationService() {
		formationdao = new FormationDao();
	}
	public boolean creationFormation(Formation pFormation) {

		formationdao.create(pFormation);
		return false;
	}

}
