package miravolabs.compose.desktop.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// ==========================================
// 1. Light Color Scheme
// ==========================================
private val LightColorScheme = lightColorScheme(
    primary = PrimaryBlue,
    onPrimary = PureWhite,
    primaryContainer = PrimaryLightBlue,
    onPrimaryContainer = PureWhite,

    secondary = SecondaryOrange,
    onSecondary = PureWhite,
    secondaryContainer = SecondaryLightOrange,
    onSecondaryContainer = PureBlack,

    tertiary = TertiaryBrown,
    onTertiary = PureWhite,
    tertiaryContainer = TertiaryLightBrown,
    onTertiaryContainer = PureWhite,

    background = BackgroundLight,
    onBackground = TextPrimaryLight,

    surface = SurfaceLight,
    onSurface = TextPrimaryLight,
    surfaceVariant = CardLight,
    onSurfaceVariant = TextSecondaryLight,

    error = PureRed,
    onError = PureWhite,

    outline = DividerLight
)

// ==========================================
// 2. Dark Color Scheme
// ==========================================
private val DarkColorScheme = darkColorScheme(
    primary = PrimaryLightBlue,
    onPrimary = PureBlack,
    primaryContainer = PrimaryDarkBlue,
    onPrimaryContainer = PureWhite,

    secondary = SecondaryLightOrange,
    onSecondary = PureBlack,
    secondaryContainer = SecondaryDarkOrange,
    onSecondaryContainer = PureWhite,

    tertiary = TertiaryLightBrown,
    onTertiary = PureBlack,
    tertiaryContainer = TertiaryDarkBrown,
    onTertiaryContainer = PureWhite,

    background = BackgroundDark,
    onBackground = TextPrimaryDark,

    surface = SurfaceDark,
    onSurface = TextPrimaryDark,
    surfaceVariant = CardDark,
    onSurfaceVariant = TextSecondaryDark,

    error = PureRed,
    onError = PureWhite,

    outline = DividerDark
)

// ==========================================
// 3. Theme Composable Function
// ==========================================
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}