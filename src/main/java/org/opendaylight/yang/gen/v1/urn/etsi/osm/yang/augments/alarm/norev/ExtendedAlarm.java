package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.extended.alarm.Alarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.extended.alarm.AlarmKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>alarm</b>
 * <pre>
 * grouping extended-alarm {
 *   list alarm {
 *     key alarm-id;
 *     leaf alarm-id {
 *       type string;
 *     }
 *     leaf vnf-monitoring-param-ref {
 *       type leafref {
 *         path /vnfd:vnfd/vnfd:df/vnfd:monitoring-parameter/vnfd:id;
 *       }
 *     }
 *     uses common:alarm-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>alarm/extended-alarm</i>
 *
 */
public interface ExtendedAlarm
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-alarm");

    @Override
    Class<? extends ExtendedAlarm> implementedInterface();
    
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

