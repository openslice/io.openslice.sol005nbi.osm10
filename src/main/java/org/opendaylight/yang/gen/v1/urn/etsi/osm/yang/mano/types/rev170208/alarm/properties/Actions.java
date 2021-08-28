package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.Alarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.AlarmKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.InsufficientData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.InsufficientDataKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.Ok;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions.OkKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container actions {
 *   list ok {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 *   list insufficient-data {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 *   list alarm {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm-properties/actions</i>
 * 
 * <p>To create instances of this class use {@link ActionsBuilder}.
 * @see ActionsBuilder
 *
 */
public interface Actions
    extends
    ChildOf<AlarmProperties>,
    Augmentable<Actions>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("actions");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.Actions> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.Actions.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>ok</code>, or <code>null</code> if not present
     */
    @Nullable Map<OkKey, Ok> getOk();
    
    /**
     * @return <code>java.util.Map</code> <code>ok</code>, or an empty list if it is not present
     */
    default @NonNull Map<OkKey, Ok> nonnullOk() {
        return CodeHelpers.nonnull(getOk());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>insufficientData</code>, or <code>null</code> if not present
     */
    @Nullable Map<InsufficientDataKey, InsufficientData> getInsufficientData();
    
    /**
     * @return <code>java.util.Map</code> <code>insufficientData</code>, or an empty list if it is not present
     */
    default @NonNull Map<InsufficientDataKey, InsufficientData> nonnullInsufficientData() {
        return CodeHelpers.nonnull(getInsufficientData());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>alarm</code>, or <code>null</code> if not present
     */
    @Nullable Map<AlarmKey, Alarm> getAlarm();
    
    /**
     * @return <code>java.util.Map</code> <code>alarm</code>, or an empty list if it is not present
     */
    default @NonNull Map<AlarmKey, Alarm> nonnullAlarm() {
        return CodeHelpers.nonnull(getAlarm());
    }

}

