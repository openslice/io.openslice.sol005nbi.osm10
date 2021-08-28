package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.extended.alarm;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.ExtendedAlarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.AlarmProperties;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>alarm</b>
 * <pre>
 * list alarm {
 *   key alarm-id;
 *   leaf alarm-id {
 *     type string;
 *   }
 *   leaf vnf-monitoring-param-ref {
 *     type leafref {
 *       path /vnfd:vnfd/vnfd:df/vnfd:monitoring-parameter/vnfd:id;
 *     }
 *   }
 *   uses common:alarm-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>alarm/extended-alarm/alarm</i>
 * 
 * <p>To create instances of this class use {@link AlarmBuilder}.
 * @see AlarmBuilder
 * @see AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<ExtendedAlarm>,
    Augmentable<Alarm>,
    AlarmProperties,
    Identifiable<AlarmKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("alarm");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.extended.alarm.Alarm> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.extended.alarm.Alarm.class;
    }
    
    /**
     * This field is reserved for the identifier assigned by the VIM provider
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alarmId</code>, or <code>null</code> if not present
     */
    @Nullable String getAlarmId();
    
    /**
     * Reference to the VNF level monitoring parameter that is aggregated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfMonitoringParamRef();
    
    @Override
    AlarmKey key();

}

