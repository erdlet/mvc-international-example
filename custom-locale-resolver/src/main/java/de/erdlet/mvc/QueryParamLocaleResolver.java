package de.erdlet.mvc;

import java.util.Locale;
import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.mvc.locale.LocaleResolver;
import javax.mvc.locale.LocaleResolverContext;

/**
 * Resolver to get the {@link Locale} to use from the requests query param <i>lang</i>.
 *
 * In case there is no request param with this name, the {@link Locale} will be resolved
 * by a higher prioritised implementation.
 *
 * Example usage:
 * <pre>
 * {@code
 * # Use default locale
 * curl <your-url>
 *
 * # Set german locale by query param
 * curl <your-url>?lang=de-DE
 * }
 * </pre>
 * @author Tobias Erdle
 */
@Priority(1)
@ApplicationScoped
public class QueryParamLocaleResolver implements LocaleResolver {

  @Override
  public Locale resolveLocale(final LocaleResolverContext context) {
    final var queryLang = context.getUriInfo()
        .getQueryParameters()
        .getFirst("lang");
    return queryLang != null ? Locale.forLanguageTag(queryLang) : null;
  }
}
