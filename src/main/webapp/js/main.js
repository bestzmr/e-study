function selectOnchang(obj) {
	//获取被选中的option标签选项 
	$("#selectContent").empty();
	var value = obj.options[obj.selectedIndex].value;
	// alert(value);
	$.get("json/overScore.js", function(data) {
		var highSchoolObj = JSON.parse(data);
		for (var i = 0; i < highSchoolObj.length; i++) {
			if (value == highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolArea]) {
				$("#selectContent").append('<p>' + highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolName] + '</p>');
			}
		}
	});
}

function collegeOnchange(obj) {
	// 清空table
	$("tr:not(:first)").empty();
	var value1 = obj.options[obj.selectedIndex].value;
	// college_info = obj.options[obj.selectedIndex].value;
	console.log(value1);
	$.get("json/college.js", function(data) {
		var collegeObj = JSON.parse(data);
		for (var i = 0; i < collegeObj.length; i++) {
			var type;
			if(collegeObj[i].collegeInfo.isArt == true){
				type = "艺术";
			}else if(collegeObj[i].collegeInfo.isDoubleFirst == true) {
				type = "双一流";
			}else if(collegeObj[i].collegeInfo.isKey == true) {
				type = "重点";
			}else if(collegeObj[i].collegeInfo.isUndergraduate == true) {
				type = "本科";
			}else {
				type= "专科";
			}
			// console.log(collegeObj[0].collegeInfo.area);
			if (value1 == collegeObj[i].collegeInfo.area) {
				// console.log(collegeObj[i].collegeInfo.name);
				$("#collegeContentT").append('<tr><td><a href="' + collegeObj[i].collegeInfo.url + '">' + collegeObj[i].collegeInfo
					.name + '</a></td><td>'+type+'</td><td>' + collegeObj[i].admissionInfos[0].score + '</td><td>' + collegeObj[i].admissionInfos[1]
					.score + '</td><td>' + collegeObj[i].admissionInfos[2].score + '</td></tr>');
			}
		}
	});

}

/*function typeOnchange(obj) {
	var college_type = obj.options[obj.selectedIndex].value;
	// college_info += obj.options[obj.selectedIndex].value;
	console.log(college_type);

}*/
