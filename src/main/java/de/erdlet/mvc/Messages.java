package de.erdlet.mvc;

import java.util.ResourceBundle;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mvc.MvcContext;

/**
 * Provides I18n messages for the UI per request. To get the correct locale, the method {@link MvcContext#getLocale()} is used.
 * This method uses the built-in {@link javax.mvc.locale.LocaleResolver} of the used MVC Implementation.
 *
 * @author Tobias Erdle
 * @see MvcContext#getLocale()
 * @see javax.mvc.locale.LocaleResolver
 */
@RequestScoped
@Named("msg")
public class Messages {

  private static final Logger LOGGER = Logger.getLogger(Messages.class.getName());

  private static final String BASE_NAME = "messages";

  @Inject
  private MvcContext mvcContext;

  /**
   * Get the assigned message to some key based on the {@link java.util.Locale} of the current request.
   *
   * @param key the message key to use
   * @return the correct translation assigned to the key for the request locale, a fallback translation or
   * a placeholder for unknown keys.
   */
  public final String get(final String key) {
    LOGGER.info(String.format("Getting message '%s' for locale '%s'", key, mvcContext.getLocale()));

    final var bundle = ResourceBundle.getBundle(BASE_NAME, mvcContext.getLocale());

    return bundle.containsKey(key) ? bundle.getString(key) : formatUnknownKey(key);
  }

  private static String formatUnknownKey(final String key) {
    return String.format("???%s???", key);
  }
}
