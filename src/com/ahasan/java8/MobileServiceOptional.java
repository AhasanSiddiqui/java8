/*
 * package com.ahasan.java8;
 * 
 * import java.util.Optional;
 * 
 * import com.ahasan.java8.beans.DisplayFeaturesWithOptional; import
 * com.ahasan.java8.beans.MobileWithOptional; import
 * com.ahasan.java8.beans.ScreenResolution;
 * 
 * public class MobileServiceOptional {
 * 
 * public Integer getMobileScreenWidth(Optional<MobileWithOptional> mobile){
 * return mobile.flatMap(MobileWithOptional::getDisplayFeatures)
 * .flatMap(DisplayFeaturesWithOptional::getResolution)
 * .map(ScreenResolution::getWidth) .orElse(0);
 * 
 * }
 * 
 * }
 */