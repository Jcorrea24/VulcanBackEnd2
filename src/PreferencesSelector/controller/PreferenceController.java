package PreferencesSelector.controller;

import PreferencesSelector.useCases.PreferenceManagerUseCase;


public class PreferenceController {

    public PreferenceManagerUseCase preferenceManagerUseCase;

    public PreferenceController() {
        this.preferenceManagerUseCase = new PreferenceManagerUseCase();
    }

    public String showAllPreferences() {
        return this.preferenceManagerUseCase.showAllPreferences();
    }

    public String findByIndex(int index) {
        return this.preferenceManagerUseCase.findByIndex(index);
    }

    public String addPreference(String studentName, String subject, int priority) {
        return this.preferenceManagerUseCase.addPreference(studentName, subject, priority);
    }

    public String updatePreference(int index, String studentName, String subject, int priority) {
        return this.preferenceManagerUseCase.updatePreference(index, studentName, subject, priority);
    }

    public String deletePreference(int index) {
        return this.preferenceManagerUseCase.deletePreference(index);
    }
}
